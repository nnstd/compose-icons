package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProjectorScreenOutline: ImageVector
    get() {
        if (_ProjectorScreenOutline != null) {
            return _ProjectorScreenOutline!!
        }
        _ProjectorScreenOutline = ImageVector.Builder(
            name = "ProjectorScreenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(3.45f, 2f, 3f, 2.45f, 3f, 3f)
                verticalLineTo(4f)
                curveTo(3f, 4.55f, 3.45f, 5f, 4f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16.59f)
                lineTo(6.79f, 20.79f)
                lineTo(8.21f, 22.21f)
                lineTo(11f, 19.41f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(19.41f)
                lineTo(15.79f, 22.21f)
                lineTo(17.21f, 20.79f)
                lineTo(13f, 16.59f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                curveTo(20.55f, 5f, 21f, 4.55f, 21f, 4f)
                verticalLineTo(3f)
                curveTo(21f, 2.45f, 20.55f, 2f, 20f, 2f)
                moveTo(17f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ProjectorScreenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectorScreenOutline: ImageVector? = null
