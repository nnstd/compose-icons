package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Attachment: ImageVector
    get() {
        if (_Attachment != null) {
            return _Attachment!!
        }
        _Attachment = ImageVector.Builder(
            name = "Attachment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 18f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 7f)
                horizontalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                horizontalLineTo(9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 13.5f)
                horizontalLineTo(18f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8.5f)
                horizontalLineTo(7.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 12.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 16.5f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()

        return _Attachment!!
    }

@Suppress("ObjectPropertyName")
private var _Attachment: ImageVector? = null
