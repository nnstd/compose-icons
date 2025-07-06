package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DataMatrixScan: ImageVector
    get() {
        if (_DataMatrixScan != null) {
            return _DataMatrixScan!!
        }
        _DataMatrixScan = ImageVector.Builder(
            name = "DataMatrixScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(22f, 0f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(24f)
                verticalLineTo(2f)
                curveTo(24f, 0.9f, 23.1f, 0f, 22f, 0f)
                moveTo(2f, 18f)
                horizontalLineTo(0f)
                verticalLineTo(22f)
                curveTo(0f, 23.1f, 0.9f, 24f, 2f, 24f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                moveTo(22f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                curveTo(23.1f, 24f, 24f, 23.1f, 24f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(8f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                moveTo(10f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                moveTo(16f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                moveTo(18f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                moveTo(18f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                moveTo(8f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _DataMatrixScan!!
    }

@Suppress("ObjectPropertyName")
private var _DataMatrixScan: ImageVector? = null
