package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandBackLeft: ImageVector
    get() {
        if (_HandBackLeft != null) {
            return _HandBackLeft!!
        }
        _HandBackLeft = ImageVector.Builder(
            name = "HandBackLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                verticalLineTo(5.75f)
                curveTo(3f, 5.06f, 3.56f, 4.5f, 4.25f, 4.5f)
                reflectiveCurveTo(5.5f, 5.06f, 5.5f, 5.75f)
                verticalLineTo(12f)
                horizontalLineTo(6.5f)
                verticalLineTo(2.75f)
                curveTo(6.5f, 2.06f, 7.06f, 1.5f, 7.75f, 1.5f)
                curveTo(8.44f, 1.5f, 9f, 2.06f, 9f, 2.75f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(1.25f)
                curveTo(10f, 0.56f, 10.56f, 0f, 11.25f, 0f)
                reflectiveCurveTo(12.5f, 0.56f, 12.5f, 1.25f)
                verticalLineTo(12f)
                horizontalLineTo(13.5f)
                verticalLineTo(3.25f)
                curveTo(13.5f, 2.56f, 14.06f, 2f, 14.75f, 2f)
                reflectiveCurveTo(16f, 2.56f, 16f, 3.25f)
                verticalLineTo(15f)
                horizontalLineTo(16.75f)
                lineTo(18.16f, 11.47f)
                curveTo(18.38f, 10.92f, 18.84f, 10.5f, 19.4f, 10.31f)
                lineTo(20.19f, 10.05f)
                curveTo(21f, 9.79f, 21.74f, 10.58f, 21.43f, 11.37f)
                lineTo(18.4f, 19f)
                curveTo(17.19f, 22f, 14.26f, 24f, 11f, 24f)
                curveTo(6.58f, 24f, 3f, 20.42f, 3f, 16f)
                close()
            }
        }.build()

        return _HandBackLeft!!
    }

@Suppress("ObjectPropertyName")
private var _HandBackLeft: ImageVector? = null
