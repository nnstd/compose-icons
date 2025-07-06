package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellAlertOutline: ImageVector
    get() {
        if (_BellAlertOutline != null) {
            return _BellAlertOutline!!
        }
        _BellAlertOutline = ImageVector.Builder(
            name = "BellAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4.29f)
                curveTo(7.12f, 5.14f, 5f, 7.82f, 5f, 11f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                lineTo(19f, 17f)
                verticalLineTo(11f)
                curveTo(19f, 7.82f, 16.88f, 5.14f, 14f, 4.29f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                moveTo(21f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(21f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                moveTo(10f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 21f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _BellAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BellAlertOutline: ImageVector? = null
