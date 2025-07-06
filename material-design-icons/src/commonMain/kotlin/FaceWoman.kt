package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceWoman: ImageVector
    get() {
        if (_FaceWoman != null) {
            return _FaceWoman!!
        }
        _FaceWoman = ImageVector.Builder(
            name = "FaceWoman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.75f, 13f)
                curveTo(13.75f, 12.31f, 14.31f, 11.75f, 15f, 11.75f)
                reflectiveCurveTo(16.25f, 12.31f, 16.25f, 13f)
                reflectiveCurveTo(15.69f, 14.25f, 15f, 14.25f)
                reflectiveCurveTo(13.75f, 13.69f, 13.75f, 13f)
                moveTo(22f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                reflectiveCurveTo(22f, 6.5f, 22f, 12f)
                moveTo(4f, 12f)
                curveTo(4f, 16.41f, 7.59f, 20f, 12f, 20f)
                reflectiveCurveTo(20f, 16.41f, 20f, 12f)
                curveTo(20f, 11.21f, 19.88f, 10.45f, 19.67f, 9.74f)
                curveTo(18.95f, 9.91f, 18.2f, 10f, 17.42f, 10f)
                curveTo(14.05f, 10f, 11.07f, 8.33f, 9.26f, 5.77f)
                curveTo(8.28f, 8.16f, 6.41f, 10.09f, 4.05f, 11.14f)
                curveTo(4f, 11.42f, 4f, 11.71f, 4f, 12f)
                moveTo(9f, 14.25f)
                curveTo(9.69f, 14.25f, 10.25f, 13.69f, 10.25f, 13f)
                reflectiveCurveTo(9.69f, 11.75f, 9f, 11.75f)
                reflectiveCurveTo(7.75f, 12.31f, 7.75f, 13f)
                reflectiveCurveTo(8.31f, 14.25f, 9f, 14.25f)
                close()
            }
        }.build()

        return _FaceWoman!!
    }

@Suppress("ObjectPropertyName")
private var _FaceWoman: ImageVector? = null
