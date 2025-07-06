package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountMail: ImageVector
    get() {
        if (_CardAccountMail != null) {
            return _CardAccountMail!!
        }
        _CardAccountMail = ImageVector.Builder(
            name = "CardAccountMail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                verticalLineTo(7f)
                lineTo(18f, 9f)
                lineTo(15f, 7f)
                verticalLineTo(8f)
                lineTo(18f, 10f)
                moveTo(22f, 3f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 3f)
                moveTo(8f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                moveTo(14f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 15f, 6f, 13.9f, 8f, 13.9f)
                curveTo(10f, 13.9f, 14f, 15f, 14f, 17f)
                moveTo(22f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
            }
        }.build()

        return _CardAccountMail!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountMail: ImageVector? = null
