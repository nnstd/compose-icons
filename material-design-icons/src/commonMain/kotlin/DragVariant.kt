package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DragVariant: ImageVector
    get() {
        if (_DragVariant != null) {
            return _DragVariant!!
        }
        _DragVariant = ImageVector.Builder(
            name = "DragVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.67f, 12f)
                lineTo(18.18f, 16.5f)
                lineTo(15.67f, 14f)
                lineTo(17.65f, 12f)
                lineTo(15.67f, 10.04f)
                lineTo(18.18f, 7.53f)
                lineTo(22.67f, 12f)
                moveTo(12f, 1.33f)
                lineTo(16.47f, 5.82f)
                lineTo(13.96f, 8.33f)
                lineTo(12f, 6.35f)
                lineTo(10f, 8.33f)
                lineTo(7.5f, 5.82f)
                lineTo(12f, 1.33f)
                moveTo(12f, 22.67f)
                lineTo(7.53f, 18.18f)
                lineTo(10.04f, 15.67f)
                lineTo(12f, 17.65f)
                lineTo(14f, 15.67f)
                lineTo(16.5f, 18.18f)
                lineTo(12f, 22.67f)
                moveTo(1.33f, 12f)
                lineTo(5.82f, 7.5f)
                lineTo(8.33f, 10f)
                lineTo(6.35f, 12f)
                lineTo(8.33f, 13.96f)
                lineTo(5.82f, 16.47f)
                lineTo(1.33f, 12f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                close()
            }
        }.build()

        return _DragVariant!!
    }

@Suppress("ObjectPropertyName")
private var _DragVariant: ImageVector? = null
