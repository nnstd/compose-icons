package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorPolygon: ImageVector
    get() {
        if (_VectorPolygon != null) {
            return _VectorPolygon!!
        }
        _VectorPolygon = ImageVector.Builder(
            name = "VectorPolygon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(4.28f)
                lineTo(5.57f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(20.06f)
                lineTo(15f, 20.05f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(19.17f)
                lineTo(20f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(6.53f)
                lineTo(14.8f, 8f)
                horizontalLineTo(9.59f)
                lineTo(8f, 5.82f)
                verticalLineTo(2f)
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(18f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                moveTo(6.31f, 8f)
                horizontalLineTo(7.11f)
                lineTo(9f, 10.59f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(10.91f)
                lineTo(16.57f, 9f)
                horizontalLineTo(18f)
                lineTo(17.16f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(18.06f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(7.6f)
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                moveTo(6f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                moveTo(17f, 18f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
            }
        }.build()

        return _VectorPolygon!!
    }

@Suppress("ObjectPropertyName")
private var _VectorPolygon: ImageVector? = null
