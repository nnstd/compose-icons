package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RayStartVertexEnd: ImageVector
    get() {
        if (_RayStartVertexEnd != null) {
            return _RayStartVertexEnd!!
        }
        _RayStartVertexEnd = ImageVector.Builder(
            name = "RayStartVertexEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 9f)
                curveTo(18.69f, 9f, 17.58f, 9.83f, 17.17f, 11f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 9.84f, 13.3f, 9f, 12f, 9f)
                reflectiveCurveTo(9.6f, 9.84f, 9.18f, 11f)
                horizontalLineTo(6.83f)
                curveTo(6.42f, 9.83f, 5.31f, 9f, 4f, 9f)
                curveTo(2.34f, 9f, 1f, 10.34f, 1f, 12f)
                reflectiveCurveTo(2.34f, 15f, 4f, 15f)
                curveTo(5.31f, 15f, 6.42f, 14.17f, 6.83f, 13f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 14.16f, 10.7f, 15f, 12f, 15f)
                reflectiveCurveTo(14.4f, 14.16f, 14.82f, 13f)
                horizontalLineTo(17.17f)
                curveTo(17.58f, 14.17f, 18.69f, 15f, 20f, 15f)
                curveTo(21.66f, 15f, 23f, 13.66f, 23f, 12f)
                reflectiveCurveTo(21.66f, 9f, 20f, 9f)
            }
        }.build()

        return _RayStartVertexEnd!!
    }

@Suppress("ObjectPropertyName")
private var _RayStartVertexEnd: ImageVector? = null
