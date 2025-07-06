package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilCircleOutline: ImageVector
    get() {
        if (_PencilCircleOutline != null) {
            return _PencilCircleOutline!!
        }
        _PencilCircleOutline = ImageVector.Builder(
            name = "PencilCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14.94f)
                lineTo(13.06f, 8.88f)
                lineTo(15.12f, 10.94f)
                lineTo(9.06f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14.94f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                moveTo(16.7f, 9.35f)
                lineTo(15.7f, 10.35f)
                lineTo(13.65f, 8.3f)
                lineTo(14.65f, 7.3f)
                curveTo(14.86f, 7.08f, 15.21f, 7.08f, 15.42f, 7.3f)
                lineTo(16.7f, 8.58f)
                curveTo(16.92f, 8.79f, 16.92f, 9.14f, 16.7f, 9.35f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
            }
        }.build()

        return _PencilCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PencilCircleOutline: ImageVector? = null
