package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleKeyboardCommand: ImageVector
    get() {
        if (_AppleKeyboardCommand != null) {
            return _AppleKeyboardCommand!!
        }
        _AppleKeyboardCommand = ImageVector.Builder(
            name = "AppleKeyboardCommand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                moveTo(16f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                moveTo(14f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                moveTo(6f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                moveTo(8f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                moveTo(18f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _AppleKeyboardCommand!!
    }

@Suppress("ObjectPropertyName")
private var _AppleKeyboardCommand: ImageVector? = null
