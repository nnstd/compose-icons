package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransitTransfer: ImageVector
    get() {
        if (_TransitTransfer != null) {
            return _TransitTransfer!!
        }
        _TransitTransfer = ImageVector.Builder(
            name = "TransitTransfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 15.5f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(16.5f)
                verticalLineTo(18.75f)
                lineTo(14f, 16.25f)
                lineTo(16.5f, 13.75f)
                verticalLineTo(15.5f)
                moveTo(19.5f, 19.75f)
                verticalLineTo(18f)
                lineTo(22f, 20.5f)
                lineTo(19.5f, 23f)
                verticalLineTo(21.25f)
                horizontalLineTo(14f)
                verticalLineTo(19.75f)
                horizontalLineTo(19.5f)
                moveTo(9.5f, 5.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 3.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 1.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 3.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 5.5f)
                moveTo(5.75f, 8.9f)
                lineTo(4f, 9.65f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(8.3f)
                lineTo(7.25f, 6.15f)
                curveTo(7.5f, 6.05f, 7.75f, 6f, 8f, 6f)
                curveTo(8.7f, 6f, 9.35f, 6.35f, 9.7f, 6.95f)
                lineTo(10.65f, 8.55f)
                curveTo(11.55f, 10f, 13.15f, 11f, 15f, 11f)
                verticalLineTo(13f)
                curveTo(12.8f, 13f, 10.85f, 12f, 9.55f, 10.4f)
                lineTo(8.95f, 13.4f)
                lineTo(11f, 15.45f)
                verticalLineTo(23f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                lineTo(6.85f, 15f)
                lineTo(5.1f, 23f)
                horizontalLineTo(3f)
                lineTo(5.75f, 8.9f)
                close()
            }
        }.build()

        return _TransitTransfer!!
    }

@Suppress("ObjectPropertyName")
private var _TransitTransfer: ImageVector? = null
