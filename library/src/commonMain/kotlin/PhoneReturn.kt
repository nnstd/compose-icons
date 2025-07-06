package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneReturn: ImageVector
    get() {
        if (_PhoneReturn != null) {
            return _PhoneReturn!!
        }
        _PhoneReturn = ImageVector.Builder(
            name = "PhoneReturn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(19.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(13.87f)
                lineTo(16.3f, 9.93f)
                lineTo(15.24f, 11f)
                lineTo(11f, 6.75f)
                lineTo(15.24f, 2.5f)
                lineTo(16.3f, 3.57f)
                lineTo(13.87f, 6f)
                horizontalLineTo(21f)
                moveTo(8.82f, 8.58f)
                curveTo(9.08f, 8.32f, 9.17f, 7.93f, 9.06f, 7.58f)
                curveTo(8.69f, 6.42f, 8.5f, 5.22f, 8.5f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 3f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(16.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                curveTo(18.79f, 15.5f, 17.58f, 15.31f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.91f, 15.43f, 15.17f)
                lineTo(13.23f, 17.37f)
                curveTo(10.39f, 15.92f, 8.09f, 13.62f, 6.64f, 10.78f)
                lineTo(8.82f, 8.58f)
                close()
            }
        }.build()

        return _PhoneReturn!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneReturn: ImageVector? = null
