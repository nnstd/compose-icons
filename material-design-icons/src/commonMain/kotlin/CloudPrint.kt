package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudPrint: ImageVector
    get() {
        if (_CloudPrint != null) {
            return _CloudPrint!!
        }
        _CloudPrint = ImageVector.Builder(
            name = "CloudPrint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.86f, 10.5f)
                curveTo(21.1f, 9.63f, 20.15f, 9.13f, 19f, 9f)
                curveTo(19f, 7.05f, 18.32f, 5.4f, 16.96f, 4.04f)
                curveTo(15.6f, 2.68f, 13.95f, 2f, 12f, 2f)
                curveTo(10.42f, 2f, 9f, 2.5f, 7.75f, 3.43f)
                reflectiveCurveTo(5.67f, 5.62f, 5.25f, 7.15f)
                curveTo(4f, 7.43f, 2.96f, 8.08f, 2.17f, 9.1f)
                reflectiveCurveTo(1f, 11.28f, 1f, 12.58f)
                curveTo(1f, 14.09f, 1.54f, 15.38f, 2.61f, 16.43f)
                curveTo(3.57f, 17.36f, 4.7f, 17.85f, 6f, 17.95f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 18f, 20.81f, 17.56f, 21.69f, 16.69f)
                curveTo(22.56f, 15.81f, 23f, 14.75f, 23f, 13.5f)
                curveTo(23f, 12.35f, 22.62f, 11.35f, 21.86f, 10.5f)
                moveTo(16f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                moveTo(15f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                moveTo(15f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                moveTo(15f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _CloudPrint!!
    }

@Suppress("ObjectPropertyName")
private var _CloudPrint: ImageVector? = null
