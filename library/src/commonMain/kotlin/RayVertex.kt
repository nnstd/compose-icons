package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RayVertex: ImageVector
    get() {
        if (_RayVertex != null) {
            return _RayVertex!!
        }
        _RayVertex = ImageVector.Builder(
            name = "RayVertex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 11f)
                horizontalLineTo(9.17f)
                curveTo(9.58f, 9.83f, 10.69f, 9f, 12f, 9f)
                curveTo(13.31f, 9f, 14.42f, 9.83f, 14.83f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 14.17f, 13.31f, 15f, 12f, 15f)
                curveTo(10.69f, 15f, 9.58f, 14.17f, 9.17f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _RayVertex!!
    }

@Suppress("ObjectPropertyName")
private var _RayVertex: ImageVector? = null
