package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProjectorScreenOff: ImageVector
    get() {
        if (_ProjectorScreenOff != null) {
            return _ProjectorScreenOff!!
        }
        _ProjectorScreenOff = ImageVector.Builder(
            name = "ProjectorScreenOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 14.89f)
                verticalLineTo(16.59f)
                lineTo(17.21f, 20.79f)
                lineTo(15.79f, 22.21f)
                lineTo(13f, 19.41f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(19.41f)
                lineTo(8.21f, 22.21f)
                lineTo(6.79f, 20.79f)
                lineTo(11f, 16.59f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(13f, 14.89f)
                moveTo(19f, 14f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                curveTo(20.55f, 5f, 21f, 4.55f, 21f, 4f)
                verticalLineTo(3f)
                curveTo(21f, 2.45f, 20.55f, 2f, 20f, 2f)
                horizontalLineTo(5.2f)
                lineTo(17.2f, 14f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _ProjectorScreenOff!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectorScreenOff: ImageVector? = null
