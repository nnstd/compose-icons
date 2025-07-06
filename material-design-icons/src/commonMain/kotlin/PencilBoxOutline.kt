package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilBoxOutline: ImageVector
    get() {
        if (_PencilBoxOutline != null) {
            return _PencilBoxOutline!!
        }
        _PencilBoxOutline = ImageVector.Builder(
            name = "PencilBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(16.7f, 9.35f)
                lineTo(15.7f, 10.35f)
                lineTo(13.65f, 8.3f)
                lineTo(14.65f, 7.3f)
                curveTo(14.86f, 7.08f, 15.21f, 7.08f, 15.42f, 7.3f)
                lineTo(16.7f, 8.58f)
                curveTo(16.92f, 8.79f, 16.92f, 9.14f, 16.7f, 9.35f)
                moveTo(7f, 14.94f)
                lineTo(13.06f, 8.88f)
                lineTo(15.12f, 10.94f)
                lineTo(9.06f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14.94f)
                close()
            }
        }.build()

        return _PencilBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PencilBoxOutline: ImageVector? = null
