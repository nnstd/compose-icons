package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Powershell: ImageVector
    get() {
        if (_Powershell != null) {
            return _Powershell!!
        }
        _Powershell = ImageVector.Builder(
            name = "Powershell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.83f, 4f)
                curveTo(22.32f, 4f, 22.63f, 4.4f, 22.5f, 4.89f)
                lineTo(19.34f, 19.11f)
                curveTo(19.23f, 19.6f, 18.75f, 20f, 18.26f, 20f)
                horizontalLineTo(2.17f)
                curveTo(1.68f, 20f, 1.37f, 19.6f, 1.5f, 19.11f)
                lineTo(4.66f, 4.89f)
                curveTo(4.77f, 4.4f, 5.25f, 4f, 5.74f, 4f)
                horizontalLineTo(21.83f)
                moveTo(15.83f, 16f)
                horizontalLineTo(11.83f)
                curveTo(11.37f, 16f, 11f, 16.38f, 11f, 16.84f)
                curveTo(11f, 17.31f, 11.37f, 17.69f, 11.83f, 17.69f)
                horizontalLineTo(15.83f)
                curveTo(16.3f, 17.69f, 16.68f, 17.31f, 16.68f, 16.84f)
                curveTo(16.68f, 16.38f, 16.3f, 16f, 15.83f, 16f)
                moveTo(5.78f, 16.28f)
                curveTo(5.38f, 16.56f, 5.29f, 17.11f, 5.57f, 17.5f)
                curveTo(5.85f, 17.92f, 6.41f, 18f, 6.81f, 17.73f)
                curveTo(14.16f, 12.56f, 14.21f, 12.5f, 14.26f, 12.47f)
                curveTo(14.44f, 12.31f, 14.53f, 12.09f, 14.54f, 11.87f)
                curveTo(14.55f, 11.67f, 14.5f, 11.5f, 14.38f, 11.31f)
                lineTo(9.46f, 6.03f)
                curveTo(9.13f, 5.67f, 8.57f, 5.65f, 8.21f, 6f)
                curveTo(7.85f, 6.32f, 7.83f, 6.88f, 8.16f, 7.24f)
                lineTo(12.31f, 11.68f)
                lineTo(5.78f, 16.28f)
                close()
            }
        }.build()

        return _Powershell!!
    }

@Suppress("ObjectPropertyName")
private var _Powershell: ImageVector? = null
