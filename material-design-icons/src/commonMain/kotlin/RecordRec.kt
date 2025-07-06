package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RecordRec: ImageVector
    get() {
        if (_RecordRec != null) {
            return _RecordRec!!
        }
        _RecordRec = ImageVector.Builder(
            name = "RecordRec",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 20f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 5f)
                moveTo(7f, 10f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                verticalLineTo(12f)
                curveTo(10f, 12.5f, 9.62f, 12.9f, 9.14f, 12.97f)
                lineTo(10.31f, 15f)
                horizontalLineTo(9.15f)
                lineTo(8f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(12f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 14f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                moveTo(16f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 14f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                moveTo(8f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
            }
        }.build()

        return _RecordRec!!
    }

@Suppress("ObjectPropertyName")
private var _RecordRec: ImageVector? = null
