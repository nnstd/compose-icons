package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rodent: ImageVector
    get() {
        if (_Rodent != null) {
            return _Rodent!!
        }
        _Rodent = ImageVector.Builder(
            name = "Rodent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.33f, 17.39f)
                curveTo(22.73f, 18.66f, 21.8f, 21f, 19.92f, 21f)
                horizontalLineTo(11.06f)
                curveTo(8.25f, 21f, 6f, 18.75f, 6f, 15.94f)
                verticalLineTo(15.89f)
                curveTo(3.7f, 15.42f, 2f, 13.41f, 2f, 11f)
                curveTo(2f, 8.25f, 4.22f, 6f, 7f, 6f)
                horizontalLineTo(9.5f)
                curveTo(9.8f, 6f, 10f, 5.77f, 10f, 5.5f)
                reflectiveCurveTo(9.8f, 5f, 9.5f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(9.5f)
                curveTo(10.88f, 3f, 12f, 4.13f, 12f, 5.5f)
                curveTo(12f, 6.89f, 10.88f, 8f, 9.5f, 8f)
                horizontalLineTo(7f)
                curveTo(5.34f, 8f, 4f, 9.33f, 4f, 11f)
                curveTo(4f, 12.37f, 4.92f, 13.5f, 6.14f, 13.87f)
                curveTo(6.7f, 11.67f, 8.67f, 10f, 11.06f, 10f)
                curveTo(11.86f, 10f, 12.66f, 10.22f, 13.36f, 10.55f)
                curveTo(11.95f, 11.34f, 11f, 12.8f, 11f, 14.5f)
                curveTo(11f, 15.75f, 11.5f, 16.87f, 12.33f, 17.67f)
                lineTo(13.03f, 16.97f)
                curveTo(12.38f, 16.36f, 12f, 15.47f, 12f, 14.5f)
                curveTo(12f, 11.91f, 14.34f, 11f, 15.5f, 11f)
                curveTo(17.58f, 11f, 19.45f, 12.89f, 18.94f, 15.23f)
                lineTo(21.33f, 17.39f)
                moveTo(18f, 19f)
                curveTo(18.56f, 19f, 19f, 18.56f, 19f, 18f)
                reflectiveCurveTo(18.56f, 17f, 18f, 17f)
                reflectiveCurveTo(17f, 17.44f, 17f, 18f)
                reflectiveCurveTo(17.44f, 19f, 18f, 19f)
                close()
            }
        }.build()

        return _Rodent!!
    }

@Suppress("ObjectPropertyName")
private var _Rodent: ImageVector? = null
