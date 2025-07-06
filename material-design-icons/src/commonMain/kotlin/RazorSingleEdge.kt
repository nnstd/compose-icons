package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RazorSingleEdge: ImageVector
    get() {
        if (_RazorSingleEdge != null) {
            return _RazorSingleEdge!!
        }
        _RazorSingleEdge = ImageVector.Builder(
            name = "RazorSingleEdge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                moveTo(22f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(3.5f)
                curveTo(4.33f, 13f, 5f, 12.33f, 5f, 11.5f)
                reflectiveCurveTo(4.33f, 10f, 3.5f, 10f)
                lineTo(2f, 10f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(20.5f)
                curveTo(19.67f, 10f, 19f, 10.67f, 19f, 11.5f)
                reflectiveCurveTo(19.67f, 13f, 20.5f, 13f)
                horizontalLineTo(22f)
                moveTo(13f, 11f)
                curveTo(13f, 10.45f, 12.55f, 10f, 12f, 10f)
                reflectiveCurveTo(11f, 10.45f, 11f, 11f)
                verticalLineTo(13f)
                curveTo(11f, 13.55f, 11.45f, 14f, 12f, 14f)
                reflectiveCurveTo(13f, 13.55f, 13f, 13f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _RazorSingleEdge!!
    }

@Suppress("ObjectPropertyName")
private var _RazorSingleEdge: ImageVector? = null
