package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Airplane: ImageVector
    get() {
        if (_Airplane != null) {
            return _Airplane!!
        }
        _Airplane = ImageVector.Builder(
            name = "Airplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.56f, 3.91f)
                curveTo(21.15f, 4.5f, 21.15f, 5.45f, 20.56f, 6.03f)
                lineTo(16.67f, 9.92f)
                lineTo(18.79f, 19.11f)
                lineTo(17.38f, 20.53f)
                lineTo(13.5f, 13.1f)
                lineTo(9.6f, 17f)
                lineTo(9.96f, 19.47f)
                lineTo(8.89f, 20.53f)
                lineTo(7.13f, 17.35f)
                lineTo(3.94f, 15.58f)
                lineTo(5f, 14.5f)
                lineTo(7.5f, 14.87f)
                lineTo(11.37f, 11f)
                lineTo(3.94f, 7.09f)
                lineTo(5.36f, 5.68f)
                lineTo(14.55f, 7.8f)
                lineTo(18.44f, 3.91f)
                curveTo(19f, 3.33f, 20f, 3.33f, 20.56f, 3.91f)
                close()
            }
        }.build()

        return _Airplane!!
    }

@Suppress("ObjectPropertyName")
private var _Airplane: ImageVector? = null
