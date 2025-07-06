package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountDetails: ImageVector
    get() {
        if (_CardAccountDetails != null) {
            return _CardAccountDetails!!
        }
        _CardAccountDetails = ImageVector.Builder(
            name = "CardAccountDetails",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(22f)
                curveTo(23.05f, 3f, 24f, 3.95f, 24f, 5f)
                verticalLineTo(19f)
                curveTo(24f, 20.05f, 23.05f, 21f, 22f, 21f)
                horizontalLineTo(2f)
                curveTo(0.95f, 21f, 0f, 20.05f, 0f, 19f)
                verticalLineTo(5f)
                curveTo(0f, 3.95f, 0.95f, 3f, 2f, 3f)
                moveTo(14f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(14f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(21.5f)
                lineTo(22f, 9f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                moveTo(14f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                moveTo(8f, 13.91f)
                curveTo(6f, 13.91f, 2f, 15f, 2f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                curveTo(14f, 15f, 10f, 13.91f, 8f, 13.91f)
                moveTo(8f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6f)
                close()
            }
        }.build()

        return _CardAccountDetails!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountDetails: ImageVector? = null
