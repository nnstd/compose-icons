package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightningBoltOutline: ImageVector
    get() {
        if (_LightningBoltOutline != null) {
            return _LightningBoltOutline!!
        }
        _LightningBoltOutline = ImageVector.Builder(
            name = "LightningBoltOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9.47f)
                verticalLineTo(11f)
                horizontalLineTo(14.76f)
                lineTo(13f, 14.53f)
                verticalLineTo(13f)
                horizontalLineTo(9.24f)
                lineTo(11f, 9.47f)
                moveTo(13f, 1f)
                lineTo(6f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                lineTo(18f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _LightningBoltOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightningBoltOutline: ImageVector? = null
