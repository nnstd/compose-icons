package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneRotatePortrait: ImageVector
    get() {
        if (_PhoneRotatePortrait != null) {
            return _PhoneRotatePortrait!!
        }
        _PhoneRotatePortrait = ImageVector.Builder(
            name = "PhoneRotatePortrait",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 1f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 1f)
                moveTo(23f, 21f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 15f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 23f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 21f)
                moveTo(9f, 21f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                moveTo(23f, 10f)
                horizontalLineTo(21.5f)
                curveTo(21.5f, 7f, 19.69f, 4.27f, 16.92f, 3.09f)
                lineTo(16f, 5f)
                lineTo(14f, 1f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 10f)
                close()
            }
        }.build()

        return _PhoneRotatePortrait!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneRotatePortrait: ImageVector? = null
