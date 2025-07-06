package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProjectorScreenVariantOff: ImageVector
    get() {
        if (_ProjectorScreenVariantOff != null) {
            return _ProjectorScreenVariantOff!!
        }
        _ProjectorScreenVariantOff = ImageVector.Builder(
            name = "ProjectorScreenVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(16.11f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                curveTo(3.45f, 9f, 3f, 8.55f, 3f, 8f)
                verticalLineTo(7f)
                curveTo(3f, 6.45f, 3.45f, 6f, 4f, 6f)
                horizontalLineTo(4.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19f, 9f)
                horizontalLineTo(20f)
                curveTo(20.55f, 9f, 21f, 8.55f, 21f, 8f)
                verticalLineTo(7f)
                curveTo(21f, 6.45f, 20.55f, 6f, 20f, 6f)
                horizontalLineTo(9.2f)
                lineTo(19f, 15.8f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _ProjectorScreenVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectorScreenVariantOff: ImageVector? = null
