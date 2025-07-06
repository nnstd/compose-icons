package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbFluorescentTube: ImageVector
    get() {
        if (_LightbulbFluorescentTube != null) {
            return _LightbulbFluorescentTube!!
        }
        _LightbulbFluorescentTube = ImageVector.Builder(
            name = "LightbulbFluorescentTube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.05f, 2.81f)
                lineTo(6.5f, 3.34f)
                lineTo(5.11f, 1.92f)
                lineTo(3.87f, 3.16f)
                lineTo(5.28f, 4.58f)
                lineTo(4.58f, 5.28f)
                lineTo(3.16f, 3.87f)
                lineTo(1.92f, 5.11f)
                lineTo(3.34f, 6.5f)
                lineTo(2.81f, 7.05f)
                lineTo(16.95f, 21.19f)
                lineTo(17.5f, 20.66f)
                lineTo(18.89f, 22.08f)
                lineTo(20.13f, 20.84f)
                lineTo(18.72f, 19.43f)
                lineTo(19.42f, 18.72f)
                lineTo(20.84f, 20.13f)
                lineTo(22.08f, 18.9f)
                lineTo(20.66f, 17.5f)
                lineTo(21.19f, 16.95f)
                lineTo(7.05f, 2.81f)
                close()
            }
        }.build()

        return _LightbulbFluorescentTube!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbFluorescentTube: ImageVector? = null
