package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Unicycle: ImageVector
    get() {
        if (_Unicycle != null) {
            return _Unicycle!!
        }
        _Unicycle = ImageVector.Builder(
            name = "Unicycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9.09f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                curveTo(14.55f, 5f, 15f, 4.55f, 15f, 4f)
                reflectiveCurveTo(14.55f, 3f, 14f, 3f)
                horizontalLineTo(10f)
                curveTo(9.45f, 3f, 9f, 3.45f, 9f, 4f)
                reflectiveCurveTo(9.45f, 5f, 10f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(9.09f)
                curveTo(8.16f, 9.57f, 6f, 12.03f, 6f, 15f)
                curveTo(6f, 18.31f, 8.69f, 21f, 12f, 21f)
                reflectiveCurveTo(18f, 18.31f, 18f, 15f)
                curveTo(18f, 12.03f, 15.84f, 9.57f, 13f, 9.09f)
                moveTo(12f, 19f)
                curveTo(9.79f, 19f, 8f, 17.21f, 8f, 15f)
                curveTo(8f, 13.14f, 9.28f, 11.59f, 11f, 11.14f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(11.14f)
                curveTo(14.72f, 11.59f, 16f, 13.14f, 16f, 15f)
                curveTo(16f, 17.21f, 14.21f, 19f, 12f, 19f)
                close()
            }
        }.build()

        return _Unicycle!!
    }

@Suppress("ObjectPropertyName")
private var _Unicycle: ImageVector? = null
