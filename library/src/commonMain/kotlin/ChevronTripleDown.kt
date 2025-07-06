package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronTripleDown: ImageVector
    get() {
        if (_ChevronTripleDown != null) {
            return _ChevronTripleDown!!
        }
        _ChevronTripleDown = ImageVector.Builder(
            name = "ChevronTripleDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.41f, 14.58f)
                lineTo(12f, 19.17f)
                lineTo(16.59f, 14.58f)
                lineTo(18f, 16f)
                lineTo(12f, 22f)
                lineTo(6f, 16f)
                lineTo(7.41f, 14.58f)
                moveTo(7.41f, 8.58f)
                lineTo(12f, 13.17f)
                lineTo(16.59f, 8.58f)
                lineTo(18f, 10f)
                lineTo(12f, 16f)
                lineTo(6f, 10f)
                lineTo(7.41f, 8.58f)
                moveTo(7.41f, 2.58f)
                lineTo(12f, 7.17f)
                lineTo(16.59f, 2.58f)
                lineTo(18f, 4f)
                lineTo(12f, 10f)
                lineTo(6f, 4f)
                lineTo(7.41f, 2.58f)
                close()
            }
        }.build()

        return _ChevronTripleDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronTripleDown: ImageVector? = null
