package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wheelchair: ImageVector
    get() {
        if (_Wheelchair != null) {
            return _Wheelchair!!
        }
        _Wheelchair = ImageVector.Builder(
            name = "Wheelchair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16f)
                lineTo(15.32f, 17.76f)
                curveTo(14.32f, 19.68f, 12.31f, 21f, 10f, 21f)
                curveTo(6.69f, 21f, 4f, 18.31f, 4f, 15f)
                curveTo(4f, 12.57f, 5.46f, 10.5f, 7.55f, 9.55f)
                lineTo(7.76f, 11.72f)
                curveTo(6.71f, 12.44f, 6f, 13.63f, 6f, 15f)
                curveTo(6f, 17.21f, 7.79f, 19f, 10f, 19f)
                curveTo(11.86f, 19f, 13.41f, 17.72f, 13.86f, 16f)
                horizontalLineTo(14f)
                moveTo(19.55f, 16.11f)
                lineTo(18.3f, 16.73f)
                lineTo(15.5f, 13f)
                horizontalLineTo(10.91f)
                lineTo(10.71f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(10.5f)
                lineTo(10.2f, 6f)
                curveTo(11.21f, 5.88f, 12f, 5.04f, 12f, 4f)
                curveTo(12f, 2.9f, 11.11f, 2f, 10f, 2f)
                reflectiveCurveTo(8f, 2.9f, 8f, 4f)
                curveTo(8f, 4.03f, 8f, 4.07f, 8f, 4.1f)
                horizontalLineTo(8f)
                lineTo(9.1f, 15f)
                horizontalLineTo(14.5f)
                lineTo(17.7f, 19.27f)
                lineTo(20.45f, 17.9f)
                lineTo(19.55f, 16.11f)
                close()
            }
        }.build()

        return _Wheelchair!!
    }

@Suppress("ObjectPropertyName")
private var _Wheelchair: ImageVector? = null
