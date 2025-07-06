package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceWomanOutline: ImageVector
    get() {
        if (_FaceWomanOutline != null) {
            return _FaceWomanOutline!!
        }
        _FaceWomanOutline = ImageVector.Builder(
            name = "FaceWomanOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(14.9f, 4f, 17.44f, 5.56f, 18.84f, 7.88f)
                curveTo(18.41f, 7.95f, 17.96f, 8f, 17.5f, 8f)
                curveTo(14.6f, 8f, 12.06f, 6.44f, 10.66f, 4.12f)
                curveTo(11.09f, 4.05f, 11.54f, 4f, 12f, 4f)
                moveTo(8.08f, 5.03f)
                curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f)
                curveTo(5.05f, 7.58f, 6.37f, 6f, 8.08f, 5.03f)
                moveTo(4f, 11.86f)
                curveTo(6.6f, 10.88f, 8.69f, 8.87f, 9.74f, 6.31f)
                curveTo(11.58f, 8.56f, 14.37f, 10f, 17.5f, 10f)
                curveTo(18.25f, 10f, 18.97f, 9.91f, 19.67f, 9.76f)
                curveTo(19.88f, 10.47f, 20f, 11.22f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.41f, 4f, 12f)
                verticalLineTo(11.86f)
                moveTo(4f, 20f)
                verticalLineTo(18f)
                curveTo(4.57f, 18.75f, 5.25f, 19.43f, 6f, 20f)
                horizontalLineTo(4f)
                moveTo(20f, 20f)
                horizontalLineTo(18f)
                curveTo(18.75f, 19.43f, 19.43f, 18.75f, 20f, 18f)
                verticalLineTo(20f)
                moveTo(13.75f, 13f)
                curveTo(13.75f, 12.31f, 14.31f, 11.75f, 15f, 11.75f)
                reflectiveCurveTo(16.25f, 12.31f, 16.25f, 13f)
                reflectiveCurveTo(15.69f, 14.25f, 15f, 14.25f)
                reflectiveCurveTo(13.75f, 13.69f, 13.75f, 13f)
                moveTo(7.75f, 13f)
                curveTo(7.75f, 12.31f, 8.31f, 11.75f, 9f, 11.75f)
                reflectiveCurveTo(10.25f, 12.31f, 10.25f, 13f)
                reflectiveCurveTo(9.69f, 14.25f, 9f, 14.25f)
                reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13f)
                close()
            }
        }.build()

        return _FaceWomanOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FaceWomanOutline: ImageVector? = null
