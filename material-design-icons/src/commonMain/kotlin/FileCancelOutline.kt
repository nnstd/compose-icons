package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCancelOutline: ImageVector
    get() {
        if (_FileCancelOutline != null) {
            return _FileCancelOutline!!
        }
        _FileCancelOutline = ImageVector.Builder(
            name = "FileCancelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(14f)
                moveTo(18f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                moveTo(11.5f, 10f)
                curveTo(14f, 10f, 16f, 12f, 16f, 14.5f)
                curveTo(16f, 17f, 14f, 19f, 11.5f, 19f)
                curveTo(9f, 19f, 7f, 17f, 7f, 14.5f)
                curveTo(7f, 12f, 9f, 10f, 11.5f, 10f)
                moveTo(11.5f, 11.5f)
                curveTo(10.94f, 11.5f, 10.42f, 11.65f, 10f, 11.92f)
                lineTo(14.08f, 16f)
                curveTo(14.35f, 15.58f, 14.5f, 15.06f, 14.5f, 14.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 11.5f)
                moveTo(8.5f, 14.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 17.5f)
                curveTo(12.06f, 17.5f, 12.58f, 17.35f, 13f, 17.08f)
                lineTo(8.92f, 13f)
                curveTo(8.65f, 13.42f, 8.5f, 13.94f, 8.5f, 14.5f)
                close()
            }
        }.build()

        return _FileCancelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileCancelOutline: ImageVector? = null
