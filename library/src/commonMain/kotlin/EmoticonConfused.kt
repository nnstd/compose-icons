package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonConfused: ImageVector
    get() {
        if (_EmoticonConfused != null) {
            return _EmoticonConfused!!
        }
        _EmoticonConfused = ImageVector.Builder(
            name = "EmoticonConfused",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(8.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 9.5f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 8f)
                moveTo(17f, 16f)
                horizontalLineTo(13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.53f, 18f)
                lineTo(7.8f, 17f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                horizontalLineTo(17f)
                moveTo(15.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 9.5f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 11f)
                close()
            }
        }.build()

        return _EmoticonConfused!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonConfused: ImageVector? = null
