package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EraserVariant: ImageVector
    get() {
        if (_EraserVariant != null) {
            return _EraserVariant!!
        }
        _EraserVariant = ImageVector.Builder(
            name = "EraserVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.14f, 3f)
                curveTo(14.63f, 3f, 14.12f, 3.2f, 13.73f, 3.59f)
                lineTo(2.59f, 14.73f)
                curveTo(1.81f, 15.5f, 1.81f, 16.77f, 2.59f, 17.56f)
                lineTo(5.03f, 20f)
                horizontalLineTo(12.69f)
                lineTo(21.41f, 11.27f)
                curveTo(22.2f, 10.5f, 22.2f, 9.23f, 21.41f, 8.44f)
                lineTo(16.56f, 3.59f)
                curveTo(16.17f, 3.2f, 15.65f, 3f, 15.14f, 3f)
                moveTo(17f, 18f)
                lineTo(15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
            }
        }.build()

        return _EraserVariant!!
    }

@Suppress("ObjectPropertyName")
private var _EraserVariant: ImageVector? = null
