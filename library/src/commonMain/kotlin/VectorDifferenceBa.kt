package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorDifferenceBa: ImageVector
    get() {
        if (_VectorDifferenceBa != null) {
            return _VectorDifferenceBa!!
        }
        _VectorDifferenceBa = ImageVector.Builder(
            name = "VectorDifferenceBa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                moveTo(16f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                moveTo(11f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                curveTo(7f, 21.11f, 7.89f, 22f, 9f, 22f)
                horizontalLineTo(11f)
                moveTo(22f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                moveTo(9f, 16f)
                curveTo(9f, 16f, 9f, 11.33f, 9f, 9f)
                curveTo(11.33f, 9f, 16f, 9f, 16f, 9f)
                curveTo(16f, 9f, 16f, 5f, 16f, 3f)
                curveTo(16f, 1.89f, 15.11f, 1f, 14f, 1f)
                horizontalLineTo(3f)
                curveTo(1.89f, 1f, 1f, 1.89f, 1f, 3f)
                verticalLineTo(14f)
                curveTo(1f, 15.11f, 1.89f, 16f, 3f, 16f)
                curveTo(5f, 16f, 9f, 16f, 9f, 16f)
                moveTo(7f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                curveTo(7.89f, 7f, 7f, 7.89f, 7f, 9f)
                verticalLineTo(14f)
                moveTo(22f, 11f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _VectorDifferenceBa!!
    }

@Suppress("ObjectPropertyName")
private var _VectorDifferenceBa: ImageVector? = null
