package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsDiamond: ImageVector
    get() {
        if (_CardsDiamond != null) {
            return _CardsDiamond!!
        }
        _CardsDiamond = ImageVector.Builder(
            name = "CardsDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                lineTo(12f, 22f)
                lineTo(5f, 12f)
                lineTo(12f, 2f)
            }
        }.build()

        return _CardsDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _CardsDiamond: ImageVector? = null
