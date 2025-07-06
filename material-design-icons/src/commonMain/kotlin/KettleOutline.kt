package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KettleOutline: ImageVector
    get() {
        if (_KettleOutline != null) {
            return _KettleOutline!!
        }
        _KettleOutline = ImageVector.Builder(
            name = "KettleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3f)
                curveTo(7.8f, 3f, 4f, 5.7f, 4f, 9f)
                curveTo(4f, 10.2f, 4.5f, 11.3f, 5.4f, 12.3f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 16.5f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(16.5f)
                curveTo(21f, 15.3f, 20.7f, 14.1f, 20f, 13f)
                lineTo(22f, 11f)
                lineTo(19f, 8f)
                lineTo(16.9f, 10.1f)
                arcTo(9.2f, 9.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, 10.4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                curveTo(7f, 7.2f, 9.5f, 5.7f, 12.5f, 5.7f)
                curveTo(13.9f, 5.7f, 15.3f, 6.1f, 16.3f, 6.7f)
                lineTo(18.3f, 4.7f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 3f)
                moveTo(12.5f, 11f)
                curveTo(16f, 11f, 19f, 14f, 19f, 16.5f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(16.5f)
                curveTo(6f, 14f, 9f, 11f, 12.5f, 11f)
                moveTo(13f, 12.5f)
                curveTo(10f, 12.5f, 8f, 14f, 8f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                curveTo(10f, 16f, 10f, 13.5f, 13f, 12.5f)
                close()
            }
        }.build()

        return _KettleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KettleOutline: ImageVector? = null
