package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronTripleLeft: ImageVector
    get() {
        if (_ChevronTripleLeft != null) {
            return _ChevronTripleLeft!!
        }
        _ChevronTripleLeft = ImageVector.Builder(
            name = "ChevronTripleLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.42f, 7.41f)
                lineTo(4.83f, 12f)
                lineTo(9.42f, 16.59f)
                lineTo(8f, 18f)
                lineTo(2f, 12f)
                lineTo(8f, 6f)
                lineTo(9.42f, 7.41f)
                moveTo(15.42f, 7.41f)
                lineTo(10.83f, 12f)
                lineTo(15.42f, 16.59f)
                lineTo(14f, 18f)
                lineTo(8f, 12f)
                lineTo(14f, 6f)
                lineTo(15.42f, 7.41f)
                moveTo(21.42f, 7.41f)
                lineTo(16.83f, 12f)
                lineTo(21.42f, 16.59f)
                lineTo(20f, 18f)
                lineTo(14f, 12f)
                lineTo(20f, 6f)
                lineTo(21.42f, 7.41f)
                close()
            }
        }.build()

        return _ChevronTripleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronTripleLeft: ImageVector? = null
