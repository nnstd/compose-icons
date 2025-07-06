package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronTripleUp: ImageVector
    get() {
        if (_ChevronTripleUp != null) {
            return _ChevronTripleUp!!
        }
        _ChevronTripleUp = ImageVector.Builder(
            name = "ChevronTripleUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.59f, 9.42f)
                lineTo(12f, 4.83f)
                lineTo(7.41f, 9.42f)
                lineTo(6f, 8f)
                lineTo(12f, 2f)
                lineTo(18f, 8f)
                lineTo(16.59f, 9.42f)
                moveTo(16.59f, 15.42f)
                lineTo(12f, 10.83f)
                lineTo(7.41f, 15.42f)
                lineTo(6f, 14f)
                lineTo(12f, 8f)
                lineTo(18f, 14f)
                lineTo(16.59f, 15.42f)
                moveTo(16.59f, 21.42f)
                lineTo(12f, 16.83f)
                lineTo(7.41f, 21.42f)
                lineTo(6f, 20f)
                lineTo(12f, 14f)
                lineTo(18f, 20f)
                lineTo(16.59f, 21.42f)
                close()
            }
        }.build()

        return _ChevronTripleUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronTripleUp: ImageVector? = null
