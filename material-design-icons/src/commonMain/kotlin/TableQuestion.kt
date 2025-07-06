package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableQuestion: ImageVector
    get() {
        if (_TableQuestion != null) {
            return _TableQuestion!!
        }
        _TableQuestion = ImageVector.Builder(
            name = "TableQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 20.5f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(20.5f)
                horizontalLineTo(19.5f)
                moveTo(17.5f, 15.5f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                curveTo(16f, 13.34f, 17.34f, 12f, 19f, 12f)
                reflectiveCurveTo(22f, 13.34f, 22f, 15f)
                curveTo(22f, 15.97f, 21.5f, 16.88f, 20.71f, 17.41f)
                lineTo(20.41f, 17.6f)
                curveTo(19.84f, 18f, 19.5f, 18.61f, 19.5f, 19.3f)
                verticalLineTo(19.5f)
                horizontalLineTo(18f)
                verticalLineTo(19.3f)
                curveTo(18f, 18.11f, 18.6f, 17f, 19.59f, 16.35f)
                lineTo(19.88f, 16.16f)
                curveTo(20.27f, 15.9f, 20.5f, 15.47f, 20.5f, 15f)
                curveTo(20.5f, 14.17f, 19.83f, 13.5f, 19f, 13.5f)
                reflectiveCurveTo(17.5f, 14.17f, 17.5f, 15f)
                verticalLineTo(15.5f)
                moveTo(18f, 3f)
                horizontalLineTo(4f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(17f)
                curveTo(2f, 18.1f, 2.9f, 19f, 4f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14.42f)
                curveTo(14.78f, 12.2f, 15.34f, 11.5f, 16.03f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(10.1f)
                curveTo(18.32f, 10.04f, 18.66f, 10f, 19f, 10f)
                reflectiveCurveTo(19.68f, 10.04f, 20f, 10.1f)
                verticalLineTo(5f)
                curveTo(20f, 3.9f, 19.11f, 3f, 18f, 3f)
                moveTo(10f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                moveTo(10f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TableQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _TableQuestion: ImageVector? = null
