package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandBackRightOutline: ImageVector
    get() {
        if (_HandBackRightOutline != null) {
            return _HandBackRightOutline!!
        }
        _HandBackRightOutline = ImageVector.Builder(
            name = "HandBackRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                curveTo(21f, 5.62f, 19.88f, 4.5f, 18.5f, 4.5f)
                curveTo(18.33f, 4.5f, 18.16f, 4.5f, 18f, 4.55f)
                verticalLineTo(4f)
                curveTo(18f, 2.62f, 16.88f, 1.5f, 15.5f, 1.5f)
                curveTo(15.27f, 1.5f, 15.04f, 1.53f, 14.83f, 1.59f)
                curveTo(14.46f, 0.66f, 13.56f, 0f, 12.5f, 0f)
                curveTo(11.27f, 0f, 10.25f, 0.89f, 10.04f, 2.06f)
                curveTo(9.87f, 2f, 9.69f, 2f, 9.5f, 2f)
                curveTo(8.12f, 2f, 7f, 3.12f, 7f, 4.5f)
                verticalLineTo(10.39f)
                curveTo(6.66f, 10.08f, 6.24f, 9.85f, 5.78f, 9.73f)
                lineTo(5f, 9.5f)
                curveTo(4.18f, 9.29f, 3.31f, 9.61f, 2.82f, 10.35f)
                curveTo(2.44f, 10.92f, 2.42f, 11.66f, 2.67f, 12.3f)
                lineTo(5.23f, 18.73f)
                curveTo(6.5f, 21.91f, 9.57f, 24f, 13f, 24f)
                curveTo(17.42f, 24f, 21f, 20.42f, 21f, 16f)
                verticalLineTo(7f)
                moveTo(19f, 16f)
                curveTo(19f, 19.31f, 16.31f, 22f, 13f, 22f)
                curveTo(10.39f, 22f, 8.05f, 20.41f, 7.09f, 18f)
                lineTo(4.5f, 11.45f)
                lineTo(5f, 11.59f)
                curveTo(5.5f, 11.71f, 5.85f, 12.05f, 6f, 12.5f)
                lineTo(7f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(4.5f)
                curveTo(9f, 4.22f, 9.22f, 4f, 9.5f, 4f)
                reflectiveCurveTo(10f, 4.22f, 10f, 4.5f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(2.5f)
                curveTo(12f, 2.22f, 12.22f, 2f, 12.5f, 2f)
                reflectiveCurveTo(13f, 2.22f, 13f, 2.5f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                curveTo(15f, 3.72f, 15.22f, 3.5f, 15.5f, 3.5f)
                reflectiveCurveTo(16f, 3.72f, 16f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                curveTo(18f, 6.72f, 18.22f, 6.5f, 18.5f, 6.5f)
                reflectiveCurveTo(19f, 6.72f, 19f, 7f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _HandBackRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandBackRightOutline: ImageVector? = null
