package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceMask: ImageVector
    get() {
        if (_FaceMask != null) {
            return _FaceMask!!
        }
        _FaceMask = ImageVector.Builder(
            name = "FaceMask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.25f, 6f)
                curveTo(18.79f, 6f, 17.61f, 7.14f, 17.5f, 8.58f)
                lineTo(12.55f, 7.16f)
                curveTo(12.19f, 7.05f, 11.81f, 7.05f, 11.45f, 7.16f)
                lineTo(6.5f, 8.58f)
                curveTo(6.39f, 7.14f, 5.21f, 6f, 3.75f, 6f)
                curveTo(2.23f, 6f, 1f, 7.23f, 1f, 8.75f)
                verticalLineTo(12.25f)
                curveTo(1f, 13.77f, 2.23f, 15f, 3.75f, 15f)
                horizontalLineTo(5.68f)
                curveTo(6.81f, 17.36f, 9.21f, 19f, 12f, 19f)
                reflectiveCurveTo(17.19f, 17.36f, 18.32f, 15f)
                horizontalLineTo(20.25f)
                curveTo(21.77f, 15f, 23f, 13.77f, 23f, 12.25f)
                verticalLineTo(8.75f)
                curveTo(23f, 7.23f, 21.77f, 6f, 20.25f, 6f)
                moveTo(5f, 13.5f)
                horizontalLineTo(3.75f)
                curveTo(3.06f, 13.5f, 2.5f, 12.94f, 2.5f, 12.25f)
                verticalLineTo(8.75f)
                curveTo(2.5f, 8.06f, 3.06f, 7.5f, 3.75f, 7.5f)
                reflectiveCurveTo(5f, 8.06f, 5f, 8.75f)
                verticalLineTo(13.5f)
                moveTo(15f, 12f)
                lineTo(12.4f, 11.3f)
                curveTo(12.1f, 11.2f, 11.8f, 11.2f, 11.6f, 11.3f)
                lineTo(9f, 12f)
                verticalLineTo(11f)
                lineTo(11.3f, 10.3f)
                curveTo(11.7f, 10.2f, 12.2f, 10.2f, 12.7f, 10.3f)
                lineTo(15f, 11f)
                verticalLineTo(12f)
                moveTo(21.5f, 12.25f)
                curveTo(21.5f, 12.94f, 20.94f, 13.5f, 20.25f, 13.5f)
                horizontalLineTo(19f)
                verticalLineTo(8.75f)
                curveTo(19f, 8.06f, 19.56f, 7.5f, 20.25f, 7.5f)
                reflectiveCurveTo(21.5f, 8.06f, 21.5f, 8.75f)
                verticalLineTo(12.25f)
                close()
            }
        }.build()

        return _FaceMask!!
    }

@Suppress("ObjectPropertyName")
private var _FaceMask: ImageVector? = null
