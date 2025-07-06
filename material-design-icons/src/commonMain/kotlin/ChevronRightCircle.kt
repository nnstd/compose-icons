package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronRightCircle: ImageVector
    get() {
        if (_ChevronRightCircle != null) {
            return _ChevronRightCircle!!
        }
        _ChevronRightCircle = ImageVector.Builder(
            name = "ChevronRightCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(10f, 18f)
                lineTo(16f, 12f)
                lineTo(10f, 6f)
                lineTo(8.6f, 7.4f)
                lineTo(13.2f, 12f)
                lineTo(8.6f, 16.6f)
                lineTo(10f, 18f)
                close()
            }
        }.build()

        return _ChevronRightCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightCircle: ImageVector? = null
