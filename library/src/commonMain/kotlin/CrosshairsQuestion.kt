package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrosshairsQuestion: ImageVector
    get() {
        if (_CrosshairsQuestion != null) {
            return _CrosshairsQuestion!!
        }
        _CrosshairsQuestion = ImageVector.Builder(
            name = "CrosshairsQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.05f, 13f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                horizontalLineTo(3.05f)
                curveTo(3.5f, 6.83f, 6.83f, 3.5f, 11f, 3.05f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(3.05f)
                curveTo(17.17f, 3.5f, 20.5f, 6.83f, 20.95f, 11f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(20.95f)
                curveTo(20.5f, 17.17f, 17.17f, 20.5f, 13f, 20.95f)
                verticalLineTo(23f)
                horizontalLineTo(11f)
                verticalLineTo(20.95f)
                curveTo(6.83f, 20.5f, 3.5f, 17.17f, 3.05f, 13f)
                moveTo(12f, 5f)
                curveTo(8.13f, 5f, 5f, 8.13f, 5f, 12f)
                reflectiveCurveTo(8.13f, 19f, 12f, 19f)
                reflectiveCurveTo(19f, 15.87f, 19f, 12f)
                reflectiveCurveTo(15.87f, 5f, 12f, 5f)
                moveTo(11.13f, 17.25f)
                horizontalLineTo(12.88f)
                verticalLineTo(15.5f)
                horizontalLineTo(11.13f)
                verticalLineTo(17.25f)
                moveTo(12f, 6.75f)
                curveTo(10.07f, 6.75f, 8.5f, 8.32f, 8.5f, 10.25f)
                horizontalLineTo(10.25f)
                curveTo(10.25f, 9.28f, 11.03f, 8.5f, 12f, 8.5f)
                reflectiveCurveTo(13.75f, 9.28f, 13.75f, 10.25f)
                curveTo(13.75f, 12f, 11.13f, 11.78f, 11.13f, 14.63f)
                horizontalLineTo(12.88f)
                curveTo(12.88f, 12.66f, 15.5f, 12.44f, 15.5f, 10.25f)
                curveTo(15.5f, 8.32f, 13.93f, 6.75f, 12f, 6.75f)
                close()
            }
        }.build()

        return _CrosshairsQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _CrosshairsQuestion: ImageVector? = null
