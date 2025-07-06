package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonConfusedOutline: ImageVector
    get() {
        if (_EmoticonConfusedOutline != null) {
            return _EmoticonConfusedOutline!!
        }
        _EmoticonConfusedOutline = ImageVector.Builder(
            name = "EmoticonConfusedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(15.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 9.5f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 8f)
                moveTo(10f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 8f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9.5f)
                moveTo(17f, 15f)
                horizontalLineTo(13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.53f, 17f)
                lineTo(7.8f, 16f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 13f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _EmoticonConfusedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonConfusedOutline: ImageVector? = null
