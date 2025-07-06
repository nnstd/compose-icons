package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronLeftCircle: ImageVector
    get() {
        if (_ChevronLeftCircle != null) {
            return _ChevronLeftCircle!!
        }
        _ChevronLeftCircle = ImageVector.Builder(
            name = "ChevronLeftCircle",
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
                moveTo(15.4f, 16.6f)
                lineTo(10.8f, 12f)
                lineTo(15.4f, 7.4f)
                lineTo(14f, 6f)
                lineTo(8f, 12f)
                lineTo(14f, 18f)
                lineTo(15.4f, 16.6f)
                close()
            }
        }.build()

        return _ChevronLeftCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftCircle: ImageVector? = null
