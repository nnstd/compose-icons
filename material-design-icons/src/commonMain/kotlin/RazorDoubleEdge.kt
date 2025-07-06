package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RazorDoubleEdge: ImageVector
    get() {
        if (_RazorDoubleEdge != null) {
            return _RazorDoubleEdge!!
        }
        _RazorDoubleEdge = ImageVector.Builder(
            name = "RazorDoubleEdge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                curveTo(19.45f, 8f, 19f, 7.55f, 19f, 7f)
                curveTo(19f, 6.45f, 19.45f, 6f, 20f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                curveTo(4.55f, 6f, 5f, 6.45f, 5f, 7f)
                curveTo(5f, 7.55f, 4.55f, 8f, 4f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                curveTo(4.55f, 15f, 5f, 15.45f, 5f, 16f)
                curveTo(5f, 16.55f, 4.55f, 17f, 4f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                curveTo(19.45f, 17f, 19f, 16.55f, 19f, 16f)
                curveTo(19f, 15.45f, 19.45f, 15f, 20f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(13.41f)
                curveTo(13.2f, 12.58f, 12.65f, 13f, 12f, 13f)
                reflectiveCurveTo(10.8f, 12.58f, 10.59f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(10.59f)
                curveTo(10.8f, 10.42f, 11.35f, 10f, 12f, 10f)
                reflectiveCurveTo(13.2f, 10.42f, 13.41f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _RazorDoubleEdge!!
    }

@Suppress("ObjectPropertyName")
private var _RazorDoubleEdge: ImageVector? = null
