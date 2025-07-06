package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceWomanProfile: ImageVector
    get() {
        if (_FaceWomanProfile != null) {
            return _FaceWomanProfile!!
        }
        _FaceWomanProfile = ImageVector.Builder(
            name = "FaceWomanProfile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.25f, 13f)
                curveTo(17.25f, 13.69f, 16.69f, 14.25f, 16f, 14.25f)
                reflectiveCurveTo(14.75f, 13.69f, 14.75f, 13f)
                reflectiveCurveTo(15.31f, 11.75f, 16f, 11.75f)
                reflectiveCurveTo(17.25f, 12.31f, 17.25f, 13f)
                moveTo(22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                reflectiveCurveTo(22f, 6.5f, 22f, 12f)
                moveTo(7f, 18f)
                curveTo(8.41f, 19.23f, 10f, 20f, 12f, 20f)
                curveTo(16.41f, 20f, 20f, 16.41f, 20f, 12f)
                curveTo(20f, 11.21f, 19.88f, 10.45f, 19.67f, 9.74f)
                curveTo(18.95f, 9.91f, 18.2f, 10f, 17.42f, 10f)
                curveTo(15.42f, 10f, 13.57f, 9.4f, 12f, 8.39f)
                curveTo(12f, 8.39f, 10.54f, 13.76f, 8.03f, 13f)
                curveTo(7.37f, 12.8f, 7f, 13.31f, 7f, 14f)
            }
        }.build()

        return _FaceWomanProfile!!
    }

@Suppress("ObjectPropertyName")
private var _FaceWomanProfile: ImageVector? = null
