package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ethereum: ImageVector
    get() {
        if (_Ethereum != null) {
            return _Ethereum!!
        }
        _Ethereum = ImageVector.Builder(
            name = "Ethereum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.75f)
                lineTo(5.75f, 12.25f)
                lineTo(12f, 16f)
                lineTo(18.25f, 12.25f)
                lineTo(12f, 1.75f)
                moveTo(5.75f, 13.5f)
                lineTo(12f, 22.25f)
                lineTo(18.25f, 13.5f)
                lineTo(12f, 17.25f)
                lineTo(5.75f, 13.5f)
                close()
            }
        }.build()

        return _Ethereum!!
    }

@Suppress("ObjectPropertyName")
private var _Ethereum: ImageVector? = null
