package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookAccount: ImageVector
    get() {
        if (_BookAccount != null) {
            return _BookAccount!!
        }
        _BookAccount = ImageVector.Builder(
            name = "BookAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(7f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                moveTo(18f, 20f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                curveTo(10f, 17.67f, 12.67f, 17f, 14f, 17f)
                reflectiveCurveTo(18f, 17.67f, 18f, 19f)
                close()
            }
        }.build()

        return _BookAccount!!
    }

@Suppress("ObjectPropertyName")
private var _BookAccount: ImageVector? = null
