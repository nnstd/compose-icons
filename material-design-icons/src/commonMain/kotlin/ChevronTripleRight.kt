package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronTripleRight: ImageVector
    get() {
        if (_ChevronTripleRight != null) {
            return _ChevronTripleRight!!
        }
        _ChevronTripleRight = ImageVector.Builder(
            name = "ChevronTripleRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.58f, 16.59f)
                lineTo(19.17f, 12f)
                lineTo(14.58f, 7.41f)
                lineTo(16f, 6f)
                lineTo(22f, 12f)
                lineTo(16f, 18f)
                lineTo(14.58f, 16.59f)
                moveTo(8.58f, 16.59f)
                lineTo(13.17f, 12f)
                lineTo(8.58f, 7.41f)
                lineTo(10f, 6f)
                lineTo(16f, 12f)
                lineTo(10f, 18f)
                lineTo(8.58f, 16.59f)
                moveTo(2.58f, 16.59f)
                lineTo(7.17f, 12f)
                lineTo(2.58f, 7.41f)
                lineTo(4f, 6f)
                lineTo(10f, 12f)
                lineTo(4f, 18f)
                lineTo(2.58f, 16.59f)
                close()
            }
        }.build()

        return _ChevronTripleRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronTripleRight: ImageVector? = null
