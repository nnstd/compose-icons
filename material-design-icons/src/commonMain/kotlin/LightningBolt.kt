package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightningBolt: ImageVector
    get() {
        if (_LightningBolt != null) {
            return _LightningBolt!!
        }
        _LightningBolt = ImageVector.Builder(
            name = "LightningBolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15f)
                horizontalLineTo(6f)
                lineTo(13f, 1f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                lineTo(11f, 23f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _LightningBolt!!
    }

@Suppress("ObjectPropertyName")
private var _LightningBolt: ImageVector? = null
