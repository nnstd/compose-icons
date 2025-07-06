package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DoorbellVideo: ImageVector
    get() {
        if (_DoorbellVideo != null) {
            return _DoorbellVideo!!
        }
        _DoorbellVideo = ImageVector.Builder(
            name = "DoorbellVideo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 15f)
                curveTo(14f, 16.11f, 13.11f, 17f, 12f, 17f)
                reflectiveCurveTo(10f, 16.11f, 10f, 15f)
                reflectiveCurveTo(10.9f, 13f, 12f, 13f)
                reflectiveCurveTo(14f, 13.9f, 14f, 15f)
                moveTo(18f, 4f)
                verticalLineTo(20f)
                curveTo(18f, 21.1f, 17.11f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(6.9f, 22f, 6f, 21.11f, 6f, 20f)
                verticalLineTo(4f)
                curveTo(6f, 2.9f, 6.9f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(17.11f, 2f, 18f, 2.9f, 18f, 4f)
                moveTo(10.5f, 7f)
                curveTo(10.5f, 7.83f, 11.17f, 8.5f, 12f, 8.5f)
                reflectiveCurveTo(13.5f, 7.83f, 13.5f, 7f)
                reflectiveCurveTo(12.83f, 5.5f, 12f, 5.5f)
                reflectiveCurveTo(10.5f, 6.17f, 10.5f, 7f)
                moveTo(16f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _DoorbellVideo!!
    }

@Suppress("ObjectPropertyName")
private var _DoorbellVideo: ImageVector? = null
