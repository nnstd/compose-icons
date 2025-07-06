package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GiftOutline: ImageVector
    get() {
        if (_GiftOutline != null) {
            return _GiftOutline!!
        }
        _GiftOutline = ImageVector.Builder(
            name = "GiftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 11f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 6f)
                horizontalLineTo(6.17f)
                curveTo(6.06f, 5.69f, 6f, 5.35f, 6f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                curveTo(10f, 2f, 10.88f, 2.5f, 11.43f, 3.24f)
                verticalLineTo(3.23f)
                lineTo(12f, 4f)
                lineTo(12.57f, 3.23f)
                verticalLineTo(3.24f)
                curveTo(13.12f, 2.5f, 14f, 2f, 15f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5f)
                curveTo(18f, 5.35f, 17.94f, 5.69f, 17.83f, 6f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 8f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(4f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(20f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                moveTo(9f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4f)
                moveTo(15f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                moveTo(3f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                moveTo(13f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _GiftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GiftOutline: ImageVector? = null
